package org.candidate.ws.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="candidate_disability_detail")
public class CandidateDisabilityDetail {
	
	@Id
	@Column(name="id",nullable=true)
/*	@GeneratedValue(generator="idgen1")
	@GenericGenerator(name="idgen1",strategy="foreign",parameters={@Parameter(value="candidatePersonalDetail",name="property")})*/
	private int Id;
	
	@Column(name="candidate_disability_type")
	private int CandidateDisabilityType;
	
	@Column(name="candidate_percentage_disability")
	private String CandidateDisabilityPercentage;
	
	@Column(name="candidate_disability_certificate_no")
	private String CandidateDisabilityCertificateNo;
	
	@Column(name="candidate_certificate_date")
	private Date CertificateDate;
	
/*	@OneToOne
	@PrimaryKeyJoinColumn
	private CandidatePersonalDetail candidatePersonalDetail;*/

	public CandidateDisabilityDetail(){}
	
	public CandidateDisabilityDetail(int candidateDisabilityType, String candidateDisabilityPercentage,
			String candidateDisabilityCertificateNo, Date certificateDate) {
		super();
		CandidateDisabilityType = candidateDisabilityType;
		CandidateDisabilityPercentage = candidateDisabilityPercentage;
		CandidateDisabilityCertificateNo = candidateDisabilityCertificateNo;
		CertificateDate = certificateDate;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCandidateDisabilityType() {
		return CandidateDisabilityType;
	}

	public void setCandidateDisabilityType(int candidateDisabilityType) {
		CandidateDisabilityType = candidateDisabilityType;
	}

	public String getCandidateDisabilityPercentage() {
		return CandidateDisabilityPercentage;
	}

	public void setCandidateDisabilityPercentage(String candidateDisabilityPercentage) {
		CandidateDisabilityPercentage = candidateDisabilityPercentage;
	}

	public String getCandidateDisabilityCertificateNo() {
		return CandidateDisabilityCertificateNo;
	}

	public void setCandidateDisabilityCertificateNo(String candidateDisabilityCertificateNo) {
		CandidateDisabilityCertificateNo = candidateDisabilityCertificateNo;
	}

	public Date getCertificateDate() {
		return CertificateDate;
	}

	public void setCertificateDate(Date certificateDate) {
		CertificateDate = certificateDate;
	}

/*	public CandidatePersonalDetail getCandidatePersonalDetail() {
		return candidatePersonalDetail;
	}

	public void setCandidatePersonalDetail(CandidatePersonalDetail candidatePersonalDetail) {
		this.candidatePersonalDetail = candidatePersonalDetail;
	}*/


	@Override
	public String toString() {
		return "CandidateDisabilityDetail [Id=" + Id + ", CandidateDisabilityType=" + CandidateDisabilityType
				+ ", CandidateDisabilityPercentage=" + CandidateDisabilityPercentage
				+ ", CandidateDisabilityCertificateNo=" + CandidateDisabilityCertificateNo + ", CertificateDate="
				+ CertificateDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((CandidateDisabilityCertificateNo == null) ? 0 : CandidateDisabilityCertificateNo.hashCode());
		result = prime * result
				+ ((CandidateDisabilityPercentage == null) ? 0 : CandidateDisabilityPercentage.hashCode());
		result = prime * result + CandidateDisabilityType;
		result = prime * result + ((CertificateDate == null) ? 0 : CertificateDate.hashCode());
		result = prime * result + Id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof CandidateDisabilityDetail))
			return false;
		CandidateDisabilityDetail other = (CandidateDisabilityDetail) obj;
		if (CandidateDisabilityCertificateNo == null) {
			if (other.CandidateDisabilityCertificateNo != null)
				return false;
		} else if (!CandidateDisabilityCertificateNo.equals(other.CandidateDisabilityCertificateNo))
			return false;
		if (CandidateDisabilityPercentage == null) {
			if (other.CandidateDisabilityPercentage != null)
				return false;
		} else if (!CandidateDisabilityPercentage.equals(other.CandidateDisabilityPercentage))
			return false;
		if (CandidateDisabilityType != other.CandidateDisabilityType)
			return false;
		if (CertificateDate == null) {
			if (other.CertificateDate != null)
				return false;
		} else if (!CertificateDate.equals(other.CertificateDate))
			return false;
		if (Id != other.Id)
			return false;
		return true;
	}



}
