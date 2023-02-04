package ESA24.model;

import javax.persistence.*;

@Entity
@Table(name = "hero")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "namehero")
    private String nameHero;
    @Column(name = "level")
    private Integer level;
    @Column(name = "classhero")
    private String classHero;
    @Column(name = "spellcells")
    private Integer spellCells;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;

    public Hero() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameHero() {
        return nameHero;
    }

    public void setNameHero(String nameHero) {
        this.nameHero = nameHero;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getClassHero() {
        return classHero;
    }

    public void setClassHero(String classHero) {
        this.classHero = classHero;
    }

    public Integer getSpellCells() {
        return spellCells;
    }

    public void setSpellCells(Integer spellCells) {
        this.spellCells = spellCells;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
