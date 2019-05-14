package org.sunbird.common.models.util;

public enum CaminoActorOperations {

    CREATE_TENANT("createTenant"),
    UPDATE_TENANT_INFO("updateTenantInfo"),
    UPDATE_TENANT_PREFERENCE_DETAILS("updateTenantPreferenceDetails"),
    GET_TENANT_INFO("getTenantInfo"),
    ADD_TENANT_PREFERENCE_DETAILS("addTenantPreferenceDetails");
    private String value;

    /**
     * constructor
     *
     * @param value String
     */
    CaminoActorOperations(String value) {
        this.value = value;
    }

    /**
     * returns the enum value
     *
     * @return String
     */
    public String getValue() {
        return this.value;
    }
}
