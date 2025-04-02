package kr.ac.kopo.won.bookmarket.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String welcomeMethod() {
        String welcomeHtml = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Welcome BookMarket</title>\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<main>\n" +
                "    <div class=\"container py-4\">\n" +
                "        <header class=\"pb-3 mb-4 border-bottom\">\n" +
                "            <a href=\"/\" class=\"d-flex align-items-center text-body-emphasis text-decoration-none\">\n" +
                "                <span class=\"fs-4\">BookMarket</span>\n" +
                "            </a>\n" +
                "            <div class=\"dropdown position-fixed bottom-0 end-0 mb-3 me-3 bd-mode-toggle\">\n" +
                "                <button id=\"bd-theme\" class=\"btn btn-bd-primary py-2 dropdown-toggle d-flex align-items-center\"\n" +
                "                        type=\"button\" aria-expanded=\"false\" data-bs-toggle=\"dropdown\" aria-label=\"Toggle theme (auto)\">\n" +
                "                    <svg class=\"bi my-1 theme-icon-active\" width=\"1em\" height=\"1em\">\n" +
                "                        <use href=\"#circle-half\"></use>\n" +
                "                    </svg>\n" +
                "                </button>\n" +
                "            </div>\n" +
                "        </header>\n" +
                "\n" +
                "        <div class=\"p-5 mb-4 bg-body-tertiary rounded-3\">\n" +
                "            <div class=\"container-fluid py-5\">\n" +
                "                <h1 class=\"display-5 fw-bold\">도서 쇼핑몰에 오신 것을 환영합니다.</h1>\n" +
                "                <p class=\"col-md-8 fs-4\">BookMarket</p>\n" +
//                "                <button class=\"btn btn-primary btn-lg\" type=\"button\">Example button</button>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"row align-items-md-stretch text-center\">\n" +
                "            <div class=\"col-md-12\">\n" +
                "                <div class=\"h-100 p-5\">\n" +
                "                    <h2>Welcome to Web Market</h2>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\n" +
                "        <footer class=\"pt-3 mt-4 text-body-secondary border-top\">\n" +
                "            <span class=\"text\">&copy; 2025 BookMarket</span>\n" +
                "        </footer>\n" +
                "    </div>\n" +
                "</main>\n" +
                "</body>\n" +
                "</html>";

        return welcomeHtml;
    }


}
