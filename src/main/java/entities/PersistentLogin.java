package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="persistent_logins")
public class PersistentLogin {
	@Id
	@Column(name="Series",length=64, nullable=false)
	private String series;
	
	@Column(name="Username",length=64, nullable=false)
	private String userName;
	
	@Column(name="Token", length=64, nullable=false)
	private String token;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Last_used")
	private Date LasteUsed;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getLasteUsed() {
		return LasteUsed;
	}

	public void setLasteUsed(Date lasteUsed) {
		LasteUsed = lasteUsed;
	}
	
	
}
