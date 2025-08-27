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
    private String typePlaignant;
    private String telephone;
    private String region;
    private String adresse;
    private String langue;
    private String objet;
    private String description;
    private String lieu;
    private String canal;
   // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/M/dd")
    private String date;
    private String urgence;
    private String moyenContact;

   // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
    private String heure;

    private String statut;

    private String priorite;

    private String categorie;


    public Plainte(String prenom, String nom, String sexe, String age, String identifiant, String typePlaignant, String telephone, String region, String adresse, String langue, String objet, String description, String lieu, String canal, String date, String urgence, String moyenContact, String heure, String statut, String priorite, String categorie) {
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
        this.identifiant = identifiant;
        this.typePlaignant = typePlaignant;
        this.telephone = telephone;
        this.region = region;
        this.adresse = adresse;
        this.langue = langue;
        this.objet = objet;
        this.description = description;
        this.lieu = lieu;
        this.canal = canal;
        this.date = date;
        this.urgence = urgence;
        this.moyenContact = moyenContact;
        this.heure = heure;
        this.statut = statut;
        this.priorite = priorite;
        this.categorie =categorie;
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



    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
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

    public String getTypePlaignant() {
        return typePlaignant;
    }

    public void setTypePlaignant(String typePlaignant) {
        this.typePlaignant = typePlaignant;
    }

    public String getMoyenContact() {
        return moyenContact;
    }

    public void setMoyenContact(String moyenContact) {
        this.moyenContact = moyenContact;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }



}
