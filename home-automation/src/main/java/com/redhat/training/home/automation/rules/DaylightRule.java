package com.redhat.training.home.automation.rules;

import com.redhat.training.home.automation.RoomConditions;

public class DaylightRule extends Rule {

    @Override
    public boolean passes(RoomConditions conditions) {
        return conditions.daylightFactor < 0.2;
    }

}