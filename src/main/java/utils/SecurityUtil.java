package utils;

import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.security.SocialUserDetails;

import entities.AppUser;
import social.SocialUserDetailsImpl;

public class SecurityUtil {
	public static void logUser(AppUser user, List<String> roleNames) {
		SocialUserDetails userDetails = new SocialUserDetailsImpl(user,roleNames);
		Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails,
				userDetails.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(authentication);
	}
}
