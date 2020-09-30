package de.micromata.confluence.rest.core.domain;

import com.google.gson.annotations.Expose;
import de.micromata.confluence.rest.core.domain.common.LinksBean;

import java.util.Map;

/**
 * Author: Christian Schulze (c.schulze@micromata.de)
 * Date: 02.07.2016
 * Project: ConfluenceTransferPlugin
 */
public class BaseBean {

    @Expose
    private Integer id;

    @Expose
    private String type;

    @Expose
    private LinksBean links;

    @Expose
    private Map<String, String> _expandable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LinksBean getLinks() {
        return links;
    }

    public void setLinks(LinksBean links) {
        this.links = links;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, String> getExpandable() {
        return _expandable;
    }

    public void setExpandable(Map<String, String> _expandable) {
        this._expandable = _expandable;
    }
}
