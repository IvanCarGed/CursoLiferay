package es.curso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Web {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "web_id")
	private Integer webId;

	@Column(name = "web_nombre")
	private String webNombre;

	@Column(name = "web_url")
	private String webUrl;

	@Column(name = "web_descripcion")
	private String webDescripcion;

	public Web() {

	}

	/**
	 * @param webNombre
	 * @param webUrl
	 * @param webDescripcion
	 */
	public Web(String webNombre, String webUrl, String webDescripcion) {
		super();
		this.webNombre = webNombre;
		this.webUrl = webUrl;
		this.webDescripcion = webDescripcion;
	}

	public Integer getWebId() {
		return webId;
	}

	public void setWebId(Integer webId) {
		this.webId = webId;
	}

	public String getWebNombre() {
		return webNombre;
	}

	public void setWebNombre(String webNombre) {
		this.webNombre = webNombre;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public String getWebDescripcion() {
		return webDescripcion;
	}

	public void setWebDescripcion(String webDescripcion) {
		this.webDescripcion = webDescripcion;
	}
	
	
}
