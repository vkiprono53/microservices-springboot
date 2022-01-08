package com.vkiprono.userservice.DTOs;

import com.vkiprono.userservice.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseTemplateDTO {
    private User user;
    private Department department;
}
