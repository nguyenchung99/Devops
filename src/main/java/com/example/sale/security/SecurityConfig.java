//package com.example.sale.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration // Đánh dấu đây là phương thức tạo Bean component
//@EnableWebSecurity // Đây là class cấu hình cho Spring Security
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true) // Kích hoạt cả 3 cách phân quyền phân thức
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Bean
//    public PasswordEncoder encoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                 .antMatchers("/admin").hasAuthority("ADMIN")
//                 .antMatchers("/free").hasAnyAuthority("ADMIN", "USER", "AUTHOR", "EDITOR")
//                 .antMatchers("/author").hasAnyAuthority("AUTHOR")
//                 .antMatchers("/user").hasAnyAuthority("USER")
//                 .antMatchers("/editor").hasAnyAuthority("EDITOR");
////                .antMatchers("/h2-console/**").permitAll().and().csrf().ignoringAntMatchers("/h2-console/**") // https://jessitron.com/2020/06/15/spring-security-for-h2-console/
////                .and().headers().frameOptions().sameOrigin().and().formLogin();
//    }
//}
