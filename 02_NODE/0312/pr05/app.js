import { orderStatus, updateStatus } from "./status.js";
let statusList = [
  ["samgyeopsal", "굽는 중"],
  ["samgyeopsal", "완료"],
  ["galbi", "굽는 중"],
  ["galbi", "완료"],
];

async function trackStatus() {
  for (let i = 0; i < statusList.length; i++) {
    let res = await updateStatus(statusList[i][0], statusList[i][1]);
    console.log(res);
  }
  console.log(`📋 최종 주문 상태: ${JSON.stringify(orderStatus)}`);
}
trackStatus();
