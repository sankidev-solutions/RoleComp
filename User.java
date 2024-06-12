import java.util.HashSet;
import java.util.Set;

public class User {

	private String entity;
	private Set<String> assetChains = new HashSet<String>();
	private Set<String> paymentChains = new HashSet<String>();
	private boolean operator;
	private boolean readOnly;
	private boolean issuer;
	private boolean dvp;
	

	public boolean isIssuer() {
		return issuer;
	}
	public void setIssuer(boolean issuer) {
		this.issuer = issuer;
	}
	public boolean isDvp() {
		return dvp;
	}
	public void setDvp(boolean dvp) {
		this.dvp = dvp;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	
	public boolean isOperator() {
		return operator;
	}
	public void setOperator(boolean operator) {
		this.operator = operator;
	}
	public boolean isReadOnly() {
		return readOnly;
	}
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}
	public Set<String> getAssetChains() {
		return assetChains;
	}
	public void setAssetChains(Set<String> assetChains) {
		this.assetChains = assetChains;
	}
	public Set<String> getPaymentChains() {
		return paymentChains;
	}
	public void setPaymentChains(Set<String> paymentChains) {
		this.paymentChains = paymentChains;
	}
	@Override
	public String toString() {
		return "User [entity=" + entity + ", assetChains=" + assetChains + ", paymentChains=" + paymentChains
				+ ", operator=" + operator + ", readOnly=" + readOnly + ", issuer=" + issuer + ", dvp=" + dvp + "]";
	}
	
	
	
	
}
