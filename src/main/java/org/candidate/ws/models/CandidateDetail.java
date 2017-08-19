package org.candidate.ws.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="candidate_detail")
public class CandidateDetail {
	
	@Id
	@Column(name="id")
	private int Id;
	
	@Column(name="candidate_identfication_mark")
	private String CandidateIdentificationMark;
	
	@Column(name="candidate_category")
	private String CandidateCategory;
	
	@Column(name="candidate_category_minority")
	private String IsCandidateFromMinority;
	
	@Column(name="candidate_nationality")
	private String CandidateNationality;
	
	@Column(name="candidate_disability")
	private int IsCandidateHandicapped;
	
/*	@OneToOne
	@PrimaryKeyJoinColumn(referencedColumnName="id")
	private CandidatePersonalDetail candidatePerosnalDetail;*/

	public CandidateDetail()
	{
		
	}
	public CandidateDetail(String candidateIdentificationMark, String candidateCategory, String isCandidateFromMinority,
			String candidateNationality, int isCandidateHandicapped) {
		super();
		CandidateIdentificationMark = candidateIdentificationMark;
		CandidateCategory = candidateCategory;
		IsCandidateFromMinority = isCandidateFromMinority;
		CandidateNationality = candidateNationality;
		IsCandidateHandicapped = isCandidateHandicapped;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCandidateIdentificationMark() {
		return CandidateIdentificationMark;
	}
	public void setCandidateIdentificationMark(String candidateIdentificationMark) {
		CandidateIdentificationMark = candidateIdentificationMark;
	}
	public String getCandidateCategory() {
		return CandidateCategory;
	}
	public void setCandidateCategory(String candidateCategory) {
		CandidateCategory = candidateCategory;
	}
	public String getIsCandidateFromMinority() {
		return IsCandidateFromMinority;
	}
	public void setIsCandidateFromMinority(String isCandidateFromMinority) {
		IsCandidateFromMinority = isCandidateFromMinority;
	}
	public String getCandidateNationality() {
		return CandidateNationality;
	}
	public void setCandidateNationality(String candidateNationality) {
		CandidateNationality = candidateNationality;
	}
	public int getIsCandidateHandicapped() {
		return IsCandidateHandicapped;
	}
	public void setIsCandidateHandicapped(int isCandidateHandicapped) {
		IsCandidateHandicapped = isCandidateHandicapped;
	}
/*	public CandidatePersonalDetail getCandidatePerosnalDetail() {
		return candidatePerosnalDetail;
	}
	public void setCandidatePerosnalDetail(CandidatePersonalDetail candidatePerosnalDetail) {
		this.candidatePerosnalDetail = candidatePerosnalDetail;
	}*/

	
	@Override
	public String toString() {
		return "CandidateDetail [Id=" + Id + ", CandidateIdentificationMark=" + CandidateIdentificationMark
				+ ", CandidateCategory=" + CandidateCategory + ", IsCandidateFromMinority=" + IsCandidateFromMinority
				+ ", CandidateNationality=" + CandidateNationality + ", IsCandidateHandicapped="
				+ IsCandidateHandicapped + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CandidateCategory == null) ? 0 : CandidateCategory.hashCode());
		result = prime * result + ((CandidateIdentificationMark == null) ? 0 : CandidateIdentificationMark.hashCode());
		result = prime * result + ((CandidateNationality == null) ? 0 : CandidateNationality.hashCode());
		result = prime * result + Id;
		result = prime * result + ((IsCandidateFromMinority == null) ? 0 : IsCandidateFromMinority.hashCode());
		result = prime * result + IsCandidateHandicapped;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof CandidateDetail))
			return false;
		CandidateDetail other = (CandidateDetail) obj;
		if (CandidateCategory == null) {
			if (other.CandidateCategory != null)
				return false;
		} else if (!CandidateCategory.equals(other.CandidateCategory))
			return false;
		if (CandidateIdentificationMark == null) {
			if (other.CandidateIdentificationMark != null)
				return false;
		} else if (!CandidateIdentificationMark.equals(other.CandidateIdentificationMark))
			return false;
		if (CandidateNationality == null) {
			if (other.CandidateNationality != null)
				return false;
		} else if (!CandidateNationality.equals(other.CandidateNationality))
			return false;
		if (Id != other.Id)
			return false;
		if (IsCandidateFromMinority == null) {
			if (other.IsCandidateFromMinority != null)
				return false;
		} else if (!IsCandidateFromMinority.equals(other.IsCandidateFromMinority))
			return false;
		if (IsCandidateHandicapped != other.IsCandidateHandicapped)
			return false;
		return true;
	}

	
}
