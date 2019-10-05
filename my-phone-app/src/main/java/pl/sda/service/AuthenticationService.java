package pl.sda.service;

import javax.servlet.http.HttpServletRequest;

public interface AuthenticationService {

    void authenticate(HttpServletRequest request);
    void logout(HttpServletRequest req);

    boolean isAuthenticated(HttpServletRequest req);
}
