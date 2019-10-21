package org.company.adapters

import org.company.commons.adapters.AdapterType
import org.company.commons.adapters.SystemAdapter
import org.springframework.stereotype.Component

@Component
class CableModem : SystemAdapter {
    override fun getType(): AdapterType {
        return AdapterType.Modem
    }
}

@Component
class Tandy : SystemAdapter {

    override fun getType(): AdapterType {
        return AdapterType.Computer
    }
}