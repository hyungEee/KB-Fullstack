import grillMeat from "./grill.js";
async function startGrilling() {
  try {
    const res = await grillMeat("삼겹살");
    console.log(res);
    console.log("🍽️ 식사 시작!");
  } catch (err) {
    console.log(err);
  }
}

startGrilling();
