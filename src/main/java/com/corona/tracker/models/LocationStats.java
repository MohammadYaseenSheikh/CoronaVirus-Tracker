package com.corona.tracker.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationStats {

    private String province;
    private String country;
    private int latestTotalCases;
    private int newCases;

}
