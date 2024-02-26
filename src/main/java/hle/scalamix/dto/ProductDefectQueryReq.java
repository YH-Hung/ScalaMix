package hle.scalamix.dto;

// Scala maven plugin cannot handle lombok annotation AND bean property annotation.
public class ProductDefectQueryReq {
    private Integer productId;
    private String inspectDt;
    private Integer defectId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getInspectDt() {
        return inspectDt;
    }

    public void setInspectDt(String inspectDt) {
        this.inspectDt = inspectDt;
    }

    public Integer getDefectId() {
        return defectId;
    }

    public void setDefectId(Integer defectId) {
        this.defectId = defectId;
    }
}
