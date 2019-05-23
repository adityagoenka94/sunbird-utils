package org.sunbird.common.responsecode;

public interface CaminoResponseMessage {

    interface Message {

        String INVALID_HOME_URL="Invalid HomeUrl. Please Provide a valid HomeUrl which exists.";
        String HOME_URL_ALREADY_EXISTS="HomeUrl Already Exists in Tenant_Info Table.";
        String INVALID_TENANT_PREFERENCE_DETAIL_ID="Please provide a valid Tenant Preference Detail Id";
        String INVALID_TENANT_INFO_ID = "Please provide a valid Tenant Info Id";
        String JSON_DATA_FORMAT_ERROR = "Json Data format is not correct. Please provide a valid Json Data";
        String VALUE_SYNTAX_ERROR = "Syntax Error in the Value key of tenant_preference_details table of Cassandra";
        String LIVE_SESSION_ALREADY_EXISTS = "Live Session already Exists with this Content Id.";
        String MULTIPLE_ROOT_ORGS = "Found multiple Root Organisations with the given HomeUrl";
        String DATE_PATTERN_ERROR = "The format of the dates entered is not correct. Correct Format (\"yyyy-MM-dd HH:mm:ss:SSSZ\")";
    }

    interface Key {

        String INVALID_HOME_URL="INVALID_HOME_URL";
        String HOME_URL_ALREADY_EXISTS="DUPLICATE_HOME_URL_EXISTS";
        String INVALID_TENANT_PREFERENCE_DETAIL_ID="INVLAID_TENANT_PREFERENCE_DETAIL_ID";
        String INVALID_TENANT_INFO_ID = "INVALID_TENANT_INFO_ID";
        String JSON_DATA_FORMAT_ERROR = "JSON DATA FORMAT ERROR";
        String VALUE_SYNTAX_ERROR = "VALUE SYNTAX ERROR";
        String LIVE_SESSION_ALREADY_EXISTS = "LIVE SESSION ALREADY EXISTS";
        String MULTIPLE_ROOT_ORGS = "MULTIPLE ROOT ORGANISATIONS WITH SAME HOME URL";
        String DATE_PATTERN_ERROR = "DATE FORMAT ERROR";
    }

    }
