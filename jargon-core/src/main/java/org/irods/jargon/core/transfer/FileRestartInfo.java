/**
 * 
 */
package org.irods.jargon.core.transfer;

import java.util.ArrayList;
import java.util.List;

/**
 * iRODS file restart info, analagous to file_restart_info_t
 * 
 * This is a representation of the file restart info used for long file restart
 * as in rcPortalOpr.c
 * 
 * @author Mike Conway - DICE
 * 
 */
public class FileRestartInfo {

	public enum RestartStatus {
		ON, OFF
	}

	public enum RestartType {
		PUT, GET
	}

	/**
	 * String representation of <code>IRODAccount</code>, which is equivalent to
	 * <code>IRODSAccount.toString()</code>. This URI format is easy to
	 * serialize and avoids saving any actual iRODS credentials inadvertantly.
	 */
	private String irodsAccountIdentifier = "";
	private String localAbsolutePath = "";
	private String irodsAbsolutePath = "";
	private RestartStatus restartStatus = RestartStatus.OFF;
	private RestartType restartType = RestartType.PUT;
	/**
	 * Cached count of the number of restart attempts
	 */
	private int numberRestarts = 0;
	private List<FileRestartDataSegment> fileRestartDataSegments = new ArrayList<FileRestartDataSegment>();

	public String getLocalAbsolutePath() {
		return localAbsolutePath;
	}

	public void setLocalAbsolutePath(String localAbsolutePath) {
		this.localAbsolutePath = localAbsolutePath;
	}

	public String getIrodsAbsolutePath() {
		return irodsAbsolutePath;
	}

	public void setIrodsAbsolutePath(String irodsAbsolutePath) {
		this.irodsAbsolutePath = irodsAbsolutePath;
	}

	public RestartStatus getRestartStatus() {
		return restartStatus;
	}

	public void setRestartStatus(RestartStatus restartStatus) {
		this.restartStatus = restartStatus;
	}

	public List<FileRestartDataSegment> getFileRestartDataSegments() {
		return fileRestartDataSegments;
	}

	public void setFileRestartDataSegments(
			List<FileRestartDataSegment> fileRestartDataSegments) {
		this.fileRestartDataSegments = fileRestartDataSegments;
	}

	/**
	 * Get the identifier associated with this info
	 * 
	 * @return {@link FileRestartInfoIdentifier} that points to this info. The
	 *         restart info is keyed by various attributes in hashes, or for
	 *         generating file names
	 */
	public FileRestartInfoIdentifier identifierFromThisInfo() {
		FileRestartInfoIdentifier identifier = new FileRestartInfoIdentifier();
		identifier.setAbsolutePath(irodsAbsolutePath);
		identifier.setIrodsAccountIdentifier(irodsAccountIdentifier);
		identifier.setRestartType(this.restartType);
		return identifier;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final int maxLen = 10;
		StringBuilder builder = new StringBuilder();
		builder.append("FileRestartInfo [");
		if (irodsAccountIdentifier != null) {
			builder.append("irodsAccountIdentifier=");
			builder.append(irodsAccountIdentifier);
			builder.append(", ");
		}
		if (localAbsolutePath != null) {
			builder.append("localAbsolutePath=");
			builder.append(localAbsolutePath);
			builder.append(", ");
		}
		if (irodsAbsolutePath != null) {
			builder.append("irodsAbsolutePath=");
			builder.append(irodsAbsolutePath);
			builder.append(", ");
		}
		if (restartStatus != null) {
			builder.append("restartStatus=");
			builder.append(restartStatus);
			builder.append(", ");
		}
		if (restartType != null) {
			builder.append("restartType=");
			builder.append(restartType);
			builder.append(", ");
		}

		builder.append(", numberRestarts=");
		builder.append(numberRestarts);
		builder.append(", ");
		if (fileRestartDataSegments != null) {
			builder.append("fileRestartDataSegments=");
			builder.append(fileRestartDataSegments.subList(0,
					Math.min(fileRestartDataSegments.size(), maxLen)));
		}
		builder.append("]");
		return builder.toString();
	}

	public String getIrodsAccountIdentifier() {
		return irodsAccountIdentifier;
	}

	public void setIrodsAccountIdentifier(String irodsAccountIdentifier) {
		this.irodsAccountIdentifier = irodsAccountIdentifier;
	}

	public RestartType getRestartType() {
		return restartType;
	}

	public void setRestartType(RestartType restartType) {
		this.restartType = restartType;
	}

	/**
	 * @return the numberRestarts
	 */
	public int getNumberRestarts() {
		return numberRestarts;
	}

	/**
	 * @param numberRestarts
	 *            the numberRestarts to set
	 */
	public void setNumberRestarts(int numberRestarts) {
		this.numberRestarts = numberRestarts;
	}

}