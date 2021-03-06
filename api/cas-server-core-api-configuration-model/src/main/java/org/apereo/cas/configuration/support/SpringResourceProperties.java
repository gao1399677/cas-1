package org.apereo.cas.configuration.support;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;

import java.io.Serializable;

/**
 * This is {@link SpringResourceProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
@Slf4j
@Getter
@Setter
public class SpringResourceProperties implements Serializable {
    private static final long serialVersionUID = 4142130961445546358L;
    /**
     * The location of service definitions. Resources can be URLS, or
     * files found either on the classpath or outside somewhere
     * in the file system.
     */
    @RequiredProperty
    private Resource location;
}
