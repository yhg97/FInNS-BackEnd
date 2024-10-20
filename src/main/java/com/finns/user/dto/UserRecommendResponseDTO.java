package com.finns.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRecommendResponseDTO {
    private long userNo;
    private String userName;
    private String imgUrl;
    private boolean follow;
}


