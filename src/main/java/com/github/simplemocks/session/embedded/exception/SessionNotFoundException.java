package com.github.simplemocks.session.embedded.exception;

import com.github.simplemocks.error_service.exception.ServiceException;
import com.github.simplemocks.session.embedded.constant.Constants;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public class SessionNotFoundException extends ServiceException {
    private static final String SESSION_NOT_EXISTS_TEMPLATE = "Session %s not exists";

    /**
     * Construct session not found exception.
     *
     * @param uid session uid
     */
    public SessionNotFoundException(String uid) {
        super(
                Constants.ERROR_SOURCE,
                "SESSION_NOT_EXISTS",
                SESSION_NOT_EXISTS_TEMPLATE.formatted(uid)
        );
    }
}