package org.sunbird.common.models.util;

public enum CaminoActorOperations {

    // MULTI_TENANT_ACTOR_DEFINATIONS
    CREATE_MULTI_TENANT_INFO("createMultiTenantInfo"),
    UPDATE_MULTI_TENANT_INFO("updateMultiTenantInfo"),
    GET_MULTI_TENANT_INFO("getMultiTenantInfo"),
    DELETE_MULTI_TENANT_INFO("deleteMultiTenantInfo"),

    // BATCH_LIVESESSIONS_ACTOR_DEFINATIONS
    CREATE_BATCH_LIVESESSIONS("createBatchLiveSessions"),
    UPDATE_BATCH_LIVESESSION("updateBatchLiveSession"),
    READ_BATCH_LIVESESSIONS("readBatchLiveSessions"),
    DELETE_BATCH_LIVESESSION("deleteBatchLiveSession");

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
