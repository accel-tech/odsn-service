package heritage.africa.odsn_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Plainte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prenom;
    private String nom;
    private String sexe;
    private String age;
    private String identifiant;
    private String plaignant;
    private String telephone;
    private String region;
    private String addresse;
    private String langue;
    private String objet;
    private String description;
    private String lieu;
    private String canal;
   // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/M/dd")
    private String date;
    private String urgence;
    private String contact;

   // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
    private String heure;

    private String statut;

    private String priorite;


    public Plainte(String prenom, String nom, String sexe, String age, String identifiant, String plaignant, String telephone, String region, String addresse, String langue, String objet, String description, String lieu, String canal, String date, String urgence, String contact, String heure, String statut, String priorite) {
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
        this.identifiant = identifiant;
        this.plaignant = plaignant;
        this.telephone = telephone;
        this.region = region;
        this.addresse = addresse;
        this.langue = langue;
        this.objet = objet;
        this.description = description;
        this.lieu = lieu;
        this.canal = canal;
        this.date = date;
        this.urgence = urgence;
        this.contact = contact;
        this.heure = heure;
        this.statut = statut;
        this.priorite = priorite;
    }

    public Plainte() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getPlaignant() {
        return plaignant;
    }

    public void setPlaignant(String plaignant) {
        this.plaignant = plaignant;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return addresse;
    }

    public void setAddress(String address) {
        this.addresse = address;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getObject() {
        return objet;
    }

    public void setObject(String objet) {
        this.objet = objet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getDate() {
        return date;
    }

    public void setDatePlainte(String date) {
        this.date = date;
    }

    public String getUrgence() {
        return urgence;
    }

    public void setUrgence(String urgence) {
        this.urgence = urgence;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getPriorite() {
        return priorite;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }
}
