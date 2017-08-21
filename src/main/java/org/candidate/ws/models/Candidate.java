package org.candidate.ws.models;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PostPersist;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.FetchMode;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="candidate_personal_detail")
public class Candidate implements Serializable{
	
	private static final long serialVersionUID = -7794296376228595791L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="candiate_full_name")
	private String FullName;
	
	@Column(name="candiate_father_name")
	private String FatherName;
	
	@Column(name="candidate_mother_name")
	private String MotherName;
	
	@Column(name="candidate_hsc_roll_no")
	private String HscRollNo;
	
	@Column(name="candidate_birth_date")
	private Date BirthDate;
	
	@Column(name="candidate_gender")
	private String Gender;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private CandidateDetail candidateDetail;
	
	@OneToOne(cascade=CascadeType.ALL,optional=true)
	@PrimaryKeyJoinColumn
	@NotFound(action=NotFoundAction.IGNORE)
	private CandidateDisabilityDetail candidateDisabilityDetail;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private CandidateContactDetail candidateContactDetail;

	public Candidate(){};
	public Candidate(String fullName, String fatherName, String motherName, String hscRollNo,
			Date birthDate, String gender) {
		super();
		FullName = fullName;
		FatherName = fatherName;
		MotherName = motherName;
		HscRollNo = hscRollNo;
		BirthDate = birthDate;
		Gender = gender;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public String getHscRollNo() {
		return HscRollNo;
	}
	public void setHscRollNo(String hscRollNo) {
		HscRollNo = hscRollNo;
	}
	public Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public CandidateDetail getCandidateDetail() {
		return candidateDetail;
	}
	public void setCandidateDetail(CandidateDetail candidateDetail) {
		this.candidateDetail = candidateDetail;
	}
	
	public CandidateDisabilityDetail getCandidateDisabilityDetail() {
		return candidateDisabilityDetail;
	}
	public void setCandidateDisabilityDetail(CandidateDisabilityDetail candidateDisabilityDetail) {
		this.candidateDisabilityDetail = candidateDisabilityDetail;
	}
	public CandidateContactDetail getCandidateContactDetail() {
		return candidateContactDetail;
	}
	public void setCandidateContactDetail(CandidateContactDetail candidateContactDetail) {
		this.candidateContactDetail = candidateContactDetail;
	}

	@PostPersist
	public void initializeCandidateDetailID()
	{
		System.out.println("reached here");
		this.candidateDetail.setId(Id);
		this.candidateContactDetail.setId(Id);
		if(getCandidateDisabilityDetail()==null)
		{
			System.out.println("null is cached");
		}
		else
		{		
			this.candidateDisabilityDetail.setId(Id);
			System.out.println("not null");
		}
		System.out.println("reached here"+Id);
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BirthDate == null) ? 0 : BirthDate.hashCode());
		result = prime * result + ((FatherName == null) ? 0 : FatherName.hashCode());
		result = prime * result + ((FullName == null) ? 0 : FullName.hashCode());
		result = prime * result + ((Gender == null) ? 0 : Gender.hashCode());
		result = prime * result + ((HscRollNo == null) ? 0 : HscRollNo.hashCode());
		result = prime * result + Id;
		result = prime * result + ((MotherName == null) ? 0 : MotherName.hashCode());
		result = prime * result + ((candidateContactDetail == null) ? 0 : candidateContactDetail.hashCode());
		result = prime * result + ((candidateDetail == null) ? 0 : candidateDetail.hashCode());
		result = prime * result + ((candidateDisabilityDetail == null) ? 0 : candidateDisabilityDetail.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Candidate))
			return false;
		Candidate other = (Candidate) obj;
		if (BirthDate == null) {
			if (other.BirthDate != null)
				return false;
		} else if (!BirthDate.equals(other.BirthDate))
			return false;
		if (FatherName == null) {
			if (other.FatherName != null)
				return false;
		} else if (!FatherName.equals(other.FatherName))
			return false;
		if (FullName == null) {
			if (other.FullName != null)
				return false;
		} else if (!FullName.equals(other.FullName))
			return false;
		if (Gender == null) {
			if (other.Gender != null)
				return false;
		} else if (!Gender.equals(other.Gender))
			return false;
		if (HscRollNo == null) {
			if (other.HscRollNo != null)
				return false;
		} else if (!HscRollNo.equals(other.HscRollNo))
			return false;
		if (Id != other.Id)
			return false;
		if (MotherName == null) {
			if (other.MotherName != null)
				return false;
		} else if (!MotherName.equals(other.MotherName))
			return false;
		if (candidateContactDetail == null) {
			if (other.candidateContactDetail != null)
				return false;
		} else if (!candidateContactDetail.equals(other.candidateContactDetail))
			return false;
		if (candidateDetail == null) {
			if (other.candidateDetail != null)
				return false;
		} else if (!candidateDetail.equals(other.candidateDetail))
			return false;
		if (candidateDisabilityDetail == null) {
			if (other.candidateDisabilityDetail != null)
				return false;
		} else if (!candidateDisabilityDetail.equals(other.candidateDisabilityDetail))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Candidate [Id=" + Id + ", FullName=" + FullName + ", FatherName=" + FatherName + ", MotherName="
				+ MotherName + ", HscRollNo=" + HscRollNo + ", BirthDate=" + BirthDate + ", Gender=" + Gender
				+ ", candidateDetail=" + candidateDetail + ", candidateDisabilityDetail=" + candidateDisabilityDetail
				+ ", candidateContactDetail=" + candidateContactDetail + "]";
	}
	
}
