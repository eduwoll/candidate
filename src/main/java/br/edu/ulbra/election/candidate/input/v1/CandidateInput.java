package br.edu.ulbra.election.candidate.input.v1;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Candidate Input Information")
public class CandidateInput {

    @ApiModelProperty(example = "John Doe", notes = "Candidate name")
    private String name;
    @ApiModelProperty(example = "1", notes = "Candidate Party ID")
    private Integer party_id;
    @ApiModelProperty(example = "97654", notes = "Candidate Election Number")
    private Integer number;
    @ApiModelProperty(example = "3", notes = "Candidate Election Id")
    private Integer election_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPartyId() {
        return party_id;
    }

    public void setPartyId(Integer partyId) {
        this.party_id = partyId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getElection_id() {
        return election_id;
    }

    public void setElection_id(Integer election_id) {
        this.election_id = election_id;
    }
}
