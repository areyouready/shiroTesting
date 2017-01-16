package de.are_you_ready.shirotesting.business;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Helper class to make Security functions of SHiro available in JSF
 * Created by sebastianbasner on 08.12.16.
 */
@Named
@RequestScoped
public class JsfSecurityTools {
    public Subject getSubject() {
        return SecurityUtils.getSubject();
    }
}
