package com.finns.security.account.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberVO {
    private int user_no;
    private String username;
    private String password;
    private Date birth;
    private String mbti_name;
    private String img_url;
    private Date renew_time;

    private List<AuthVO> authList;

    UserDetails details;
}