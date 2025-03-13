async function workout() {
  console.log("운동 기록 처리 시작");
  console.log(await runStretching());
  console.log(await runTreadmill());
  console.log(await runProtein());
  console.log("운동 기록 처리 종료");
}
function runStretching() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve("스트레칭 완료");
    }, 1000);
  });
}
function runTreadmill() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve("러닝머신 완료");
    }, 500);
  });
}
function runProtein() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve("단백질 보충 완료");
    }, 0);
  });
}

workout();
