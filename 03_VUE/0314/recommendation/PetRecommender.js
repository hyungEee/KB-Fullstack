import fs from "fs/promises";
import { stringify } from "querystring";
class PetRecommender {
  recommendLog = [];

  recommendPet(customer) {
    let res = "";
    if (customer.lifestyle == "활동적") {
      res = "골든 리트리버";
    } else if (customer.lifestyle == "조용한") {
      res = "고양이";
    }
    this.recommendLog.push({ name: customer.name, recommendedPet: res });
  }

  saveToFile() {
    fs.writeFile(
      "./KB-Fullstack/03_VUE/0314/recommendation/pet_recommendations.json",
      JSON.stringify(this.recommendLog)
    );
  }
}

export default PetRecommender;
