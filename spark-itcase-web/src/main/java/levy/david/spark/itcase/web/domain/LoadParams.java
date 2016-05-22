package levy.david.spark.itcase.web.domain;

public class LoadParams {

	private String groupId;
	
	private String artifactId;
	
	private String version;

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "LoadParams [groupId=" + groupId + ", artifactId=" + artifactId
				+ ", version=" + version + "]";
	}
	
	
	
}
