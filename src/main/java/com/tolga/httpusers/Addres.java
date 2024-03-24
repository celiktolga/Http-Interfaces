package com.tolga.httpusers;

public record Addres(
        String street,
        String suite,
        String city,
        String zipcode,
        Geo geo
) {
}
