package myCompany.taskManager.userService.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class OAuth2LoginFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException exception) throws IOException {
        String targetUrl = determineTargetUrl(request, response);
        if (response.isCommitted()) {
            return;
        }
        getRedirectStrategy().sendRedirect(request, response, targetUrl);
    }

    private String determineTargetUrl(HttpServletRequest request, HttpServletResponse response) {
        // You can customize the target URL based on your requirements
        return "/login?error";
    }
}
