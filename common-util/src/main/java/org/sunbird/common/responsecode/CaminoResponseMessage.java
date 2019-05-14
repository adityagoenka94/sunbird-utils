package org.sunbird.common.responsecode;

public interface CaminoResponseMessage {

    interface Message {

        String INVALID_HOME_URL="Invalid HomeUrl. Please Provide a valid HomeUrl which exists.";
        String HOME_URL_ALREADY_EXISTS="HomeUrl Already Exists in Tenant_Info Table.";
        String INVALID_TENANT_PREFERENCE_DETAIL_ID="Please provide a valid Tenant Preference Detail Id";
        String INVALID_TENANT_INFO_ID = "Please provide a valid Tenant Info Id";
        String JSON_DATA_FORMAT_ERROR = "Json Data format is not correct. Please provide a valid Json Data";
        String VALUE_SYNTAX_ERROR = "Syntax Error in the Value key of tenant_preference_details table of Cassandra";
    }

    interface Key {

        String INVALID_HOME_URL="INVALID_HOME_URL";
        String HOME_URL_ALREADY_EXISTS="DUPLICATE_HOME_URL_EXISTS";
        String INVALID_TENANT_PREFERENCE_DETAIL_ID="INVLAID_TENANT_PREFERENCE_DETAIL_ID";
        String INVALID_TENANT_INFO_ID = "INVALID_TENANT_INFO_ID";
        String JSON_DATA_FORMAT_ERROR = "JSON Data format Error";
        String VALUE_SYNTAX_ERROR = "Value Syntax Error";
    }

    }
