package kr.ac.kopo.won.bookmarket.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CommonException {
    @ExceptionHandler(value = CategoryException.class)
    private ModelAndView handleException(HttpServletRequest request, CategoryException e) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("category", e.getCategory());
        mav.addObject("errorMessage", e.getErrorMessage());         // 변경됨
        mav.addObject("exception", e.toString());                   // 원래 있던 예외 객체 toString
        mav.addObject("url", request.getRequestURL());
        mav.setViewName("errorCommon");
        return mav;
    }

}
