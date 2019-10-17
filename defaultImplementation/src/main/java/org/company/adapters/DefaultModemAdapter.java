package org.company.adapters;

import org.company.commons.adapters.AdapterType;
import org.company.commons.adapters.SystemAdapter;
import org.springframework.stereotype.Component;

@Component
public class DefaultModemAdapter implements SystemAdapter {
    @Override
    public AdapterType getType() {
        return AdapterType.Modem;
    }
}
