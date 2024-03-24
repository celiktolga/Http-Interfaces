package com.tolga.httpusers;

public record User(
        Integer id,
        String name,
        String username,
        String email,
        Addres address,
        String phone,
        String website,
        Company company
) {
}
