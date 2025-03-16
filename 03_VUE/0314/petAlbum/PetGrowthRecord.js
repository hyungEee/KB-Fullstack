import Pet from "./Pet.js";
class PetGrowthRecords extends Pet {
  constructor(name, species, adoptionDate, description, recordDate) {
    super(name, species, adoptionDate);
    this.description = description;
    this.recordDate = recordDate;
    this.type = "Growth Record";
  }
}
export default PetGrowthRecords;
