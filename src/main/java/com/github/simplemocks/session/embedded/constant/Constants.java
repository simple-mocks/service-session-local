package com.github.simplemocks.session.embedded.constant;

import com.github.simplemocks.error_service.api.dto.ErrorSourceId;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author sibmaks
 * @since 0.0.3
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Constants {

    public static final ErrorSourceId ERROR_SOURCE = new ErrorSourceId("SESSION_SERVICE");

}