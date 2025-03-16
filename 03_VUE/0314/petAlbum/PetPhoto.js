import Pet from "./Pet.js";
class PetPhoto extends Pet {
  constructor(name, species, adoptionDate, photoPath) {
    super(name, species, adoptionDate);
    this.photoPath = photoPath;
    this.uploadDate = new Date();
    this.type = "photo";
  }
}
export default PetPhoto;
