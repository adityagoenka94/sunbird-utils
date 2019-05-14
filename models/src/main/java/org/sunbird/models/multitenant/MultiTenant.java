package org.sunbird.models.multitenant;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.sunbird.common.models.util.JsonKey;
import java.io.Serializable;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)

public class MultiTenant implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String channel;
    private String orgId;
    private String homeUrl;
    private String hashTagId;
    private String externalId;
    private String imgUrl;
    private Boolean isRootOrg;
    private String orgName;
    private String rootOrgId;
    private String provider;
    private String slug;
    private String preferredLanguage;
    private String description;
    private String email;


    public MultiTenant(){

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }


    public void setHashTagId(String hashTagId) {
        this.hashTagId = hashTagId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setIsRootOrg(Boolean isRootOrg) {
        this.isRootOrg = isRootOrg;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setRootOrgId(String rootOrgId) {
        this.rootOrgId = rootOrgId;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getHomeUrl() {
        return homeUrl;
    }

    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    public String getId() {
        return id;
    }

    public String getChannel() {
        return channel;
    }


    public String getHashtagid() {
        return hashTagId;
    }

    public String getExternalId() {
        return externalId;
    }

    public String getimgUrl() {
        return imgUrl;
    }

    public Boolean getisRootOrg() {
        return isRootOrg;
    }

    public String getorgName() {
        return orgName;
    }

    public String getrootOrgId() {
        return rootOrgId;
    }

    public String getProvider() {
        return provider;
    }

    public String getSlug() {
        return slug;
    }

    public String getpreferredLanguage() {
        return preferredLanguage;
    }

    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }

}
