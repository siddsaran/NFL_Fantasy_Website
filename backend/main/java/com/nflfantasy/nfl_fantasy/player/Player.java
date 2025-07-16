package com.nflfantasy.nfl_fantasy.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_stat")
public class Player {

    @Id
    @Column(name="player_name", unique=true)
    private String name;

    @Column(name="age")
    private Integer age;

    @Column(name="position")
    private String position;

    @Column(name="team_name")
    private String team;

    @Column(name="games_played")
    private Integer gamesPlayed;

    @Column(name="games_started")
    private Integer gamesStarted;

    @Column(name="pass_completions")
    private Double passCompletions;

    @Column(name="pass_attempts")
    private Double passAttempts;

    @Column(name="pass_completion_percent")
    private Double passCompletionPercentage;

    @Column(name="pass_yards")
    private Double passYards;

    @Column(name="pass_yards_per_attempt")
    private Double passYardsPerAttempt;

    @Column(name="pass_touchdowns")
    private Double passTouchdowns;

    @Column(name="pass_interceptions")
    private Double interceptionsThrown;

    @Column(name="qbr")
    private Double qbr;

    @Column(name="sacks")
    private Double sacksTaken;

    @Column(name="rush_attempts")
    private Double rushAttempts;

    @Column(name="rush_yards")
    private Double rushYards;

    @Column(name="rush_touchdowns")
    private Double rushTouchdowns;

    @Column(name="rush_yards_per_attempt")
    private Double rushYardsPerAttempt;

    @Column(name="recieving_targets")
    private Double targets;

    @Column(name="recieving_receptions")
    private Double receptions;

    @Column(name="recieving_yards")
    private Double receivingYards;

    @Column(name="recieving_yards_per_rec")
    private Double receivingYardsPerAttempt;

    @Column(name="recieving_touchdowns")
    private Double receivingTouchdowns;

    @Column(name="fumbles")
    private Double fumbles;

    @Column(name="fga_0to19")
    private Double fga_0_19;

    @Column(name="fgm_0to19")
    private Double fgm_0_19;

    @Column(name="fga_20to29")
    private Double fga_20_29;

    @Column(name="fgm_20to29")
    private Double fgm_20_29;

    @Column(name="fga_30to39")
    private Double fga_30_39;

    @Column(name="fgm_30to39")
    private Double fgm_30_39;

    @Column(name="fga_40to49")
    private Double fga_40_49;

    @Column(name="fgm_40to49")
    private Double fgm_40_49;

    @Column(name="fga_50plus")
    private Double fga_50_plus;

    @Column(name="fgm_50plus")
    private Double fgm_50_plus;

    @Column(name="fga_total")
    private Double fga;

    @Column(name="fgm_total")
    private Double fgm;

    @Column(name="xpa_total")
    private Double xpa;

    @Column(name="xpm_total")
    private Double xpm;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Integer age, String position, String team, Integer gamesPlayed, Integer gamesStarted, Double passCompletions, Double passAttempts, Double passCompletionPercentage, Double passYards, Double passYardsPerAttempt, Double passTouchdowns, Double interceptionsThrown, Double qbr, Double sacksTaken, Double rushAttempts, Double rushYards, Double rushTouchdowns, Double rushYardsPerAttempt, Double targets, Double receptions, Double receivingYards, Double receivingYardsPerAttempt, Double receivingTouchdowns, Double fumbles, Double fga_0_19, Double fgm_0_19, Double fga_20_29, Double fgm_20_29, Double fga_30_39, Double fgm_30_39, Double fga_40_49, Double fgm_40_49, Double fga_50_plus, Double fgm_50_plus, Double fga, Double fgm, Double xpa, Double xpm) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
        this.gamesStarted = gamesStarted;
        this.passCompletions = passCompletions;
        this.passAttempts = passAttempts;
        this.passCompletionPercentage = passCompletionPercentage;
        this.passYards = passYards;
        this.passYardsPerAttempt = passYardsPerAttempt;
        this.passTouchdowns = passTouchdowns;
        this.interceptionsThrown = interceptionsThrown;
        this.qbr = qbr;
        this.sacksTaken = sacksTaken;
        this.rushAttempts = rushAttempts;
        this.rushYards = rushYards;
        this.rushTouchdowns = rushTouchdowns;
        this.rushYardsPerAttempt = rushYardsPerAttempt;
        this.targets = targets;
        this.receptions = receptions;
        this.receivingYards = receivingYards;
        this.receivingYardsPerAttempt = receivingYardsPerAttempt;
        this.receivingTouchdowns = receivingTouchdowns;
        this.fumbles = fumbles;
        this.fga_0_19 = fga_0_19;
        this.fgm_0_19 = fgm_0_19;
        this.fga_20_29 = fga_20_29;
        this.fgm_20_29 = fgm_20_29;
        this.fga_30_39 = fga_30_39;
        this.fgm_30_39 = fgm_30_39;
        this.fga_40_49 = fga_40_49;
        this.fgm_40_49 = fgm_40_49;
        this.fga_50_plus = fga_50_plus;
        this.fgm_50_plus = fgm_50_plus;
        this.fga = fga;
        this.fgm = fgm;
        this.xpa = xpa;
        this.xpm = xpm;
    }

    public Player() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(Integer gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public Double getPassCompletions() {
        return passCompletions;
    }

    public void setPassCompletions(Double passCompletions) {
        this.passCompletions = passCompletions;
    }

    public Double getPassAttempts() {
        return passAttempts;
    }

    public void setPassAttempts(Double passAttempts) {
        this.passAttempts = passAttempts;
    }

    public Double getPassCompletionPercentage() {
        return passCompletionPercentage;
    }

    public void setPassCompletionPercentage(Double passCompletionPercentage) {
        this.passCompletionPercentage = passCompletionPercentage;
    }

    public Double getPassYards() {
        return passYards;
    }

    public void setPassYards(Double passYards) {
        this.passYards = passYards;
    }

    public Double getPassYardsPerAttempt() {
        return passYardsPerAttempt;
    }

    public void setPassYardsPerAttempt(Double passYardsPerAttempt) {
        this.passYardsPerAttempt = passYardsPerAttempt;
    }

    public Double getPassTouchdowns() {
        return passTouchdowns;
    }

    public void setPassTouchdowns(Double passTouchdowns) {
        this.passTouchdowns = passTouchdowns;
    }

    public Double getInterceptionsThrown() {
        return interceptionsThrown;
    }

    public void setInterceptionsThrown(Double interceptionsThrown) {
        this.interceptionsThrown = interceptionsThrown;
    }

    public Double getQbr() {
        return qbr;
    }

    public void setQbr(Double qbr) {
        this.qbr = qbr;
    }

    public Double getSacksTaken() {
        return sacksTaken;
    }

    public void setSacksTaken(Double sacksTaken) {
        this.sacksTaken = sacksTaken;
    }

    public Double getRushAttempts() {
        return rushAttempts;
    }

    public void setRushAttempts(Double rushAttempts) {
        this.rushAttempts = rushAttempts;
    }

    public Double getRushYards() {
        return rushYards;
    }

    public void setRushYards(Double rushYards) {
        this.rushYards = rushYards;
    }

    public Double getRushTouchdowns() {
        return rushTouchdowns;
    }

    public void setRushTouchdowns(Double rushTouchdowns) {
        this.rushTouchdowns = rushTouchdowns;
    }

    public Double getRushYardsPerAttempt() {
        return rushYardsPerAttempt;
    }

    public void setRushYardsPerAttempt(Double rushYardsPerAttempt) {
        this.rushYardsPerAttempt = rushYardsPerAttempt;
    }

    public Double getTargets() {
        return targets;
    }

    public void setTargets(Double targets) {
        this.targets = targets;
    }

    public Double getReceptions() {
        return receptions;
    }

    public void setReceptions(Double receptions) {
        this.receptions = receptions;
    }

    public Double getReceivingYards() {
        return receivingYards;
    }

    public void setReceivingYards(Double receivingYards) {
        this.receivingYards = receivingYards;
    }

    public Double getReceivingYardsPerAttempt() {
        return receivingYardsPerAttempt;
    }

    public void setReceivingYardsPerAttempt(Double receivingYardsPerAttempt) {
        this.receivingYardsPerAttempt = receivingYardsPerAttempt;
    }

    public Double getReceivingTouchdowns() {
        return receivingTouchdowns;
    }

    public void setReceivingTouchdowns(Double receivingTouchdowns) {
        this.receivingTouchdowns = receivingTouchdowns;
    }

    public Double getFumbles() {
        return fumbles;
    }

    public void setFumbles(Double fumbles) {
        this.fumbles = fumbles;
    }

    public Double getFga_0_19() {
        return fga_0_19;
    }

    public void setFga_0_19(Double fga_0_19) {
        this.fga_0_19 = fga_0_19;
    }

    public Double getFgm_0_19() {
        return fgm_0_19;
    }

    public void setFgm_0_19(Double fgm_0_19) {
        this.fgm_0_19 = fgm_0_19;
    }

    public Double getFga_20_29() {
        return fga_20_29;
    }

    public void setFga_20_29(Double fga_20_29) {
        this.fga_20_29 = fga_20_29;
    }

    public Double getFgm_20_29() {
        return fgm_20_29;
    }

    public void setFgm_20_29(Double fgm_20_29) {
        this.fgm_20_29 = fgm_20_29;
    }

    public Double getFga_30_39() {
        return fga_30_39;
    }

    public void setFga_30_39(Double fga_30_39) {
        this.fga_30_39 = fga_30_39;
    }

    public Double getFgm_30_39() {
        return fgm_30_39;
    }

    public void setFgm_30_39(Double fgm_30_39) {
        this.fgm_30_39 = fgm_30_39;
    }

    public Double getFga_40_49() {
        return fga_40_49;
    }

    public void setFga_40_49(Double fga_40_49) {
        this.fga_40_49 = fga_40_49;
    }

    public Double getFgm_40_49() {
        return fgm_40_49;
    }

    public void setFgm_40_49(Double fgm_40_49) {
        this.fgm_40_49 = fgm_40_49;
    }

    public Double getFga_50_plus() {
        return fga_50_plus;
    }

    public void setFga_50_plus(Double fga_50_plus) {
        this.fga_50_plus = fga_50_plus;
    }

    public Double getFgm_50_plus() {
        return fgm_50_plus;
    }

    public void setFgm_50_plus(Double fgm_50_plus) {
        this.fgm_50_plus = fgm_50_plus;
    }

    public Double getFga() {
        return fga;
    }

    public void setFga(Double fga) {
        this.fga = fga;
    }

    public Double getFgm() {
        return fgm;
    }

    public void setFgm(Double fgm) {
        this.fgm = fgm;
    }

    public Double getXpa() {
        return xpa;
    }

    public void setXpa(Double xpa) {
        this.xpa = xpa;
    }

    public Double getXpm() {
        return xpm;
    }

    public void setXpm(Double xpm) {
        this.xpm = xpm;
    }
}
