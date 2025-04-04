import { defineStore } from "pinia";
import { computed, reactive } from "vue";
import axios from "axios";

export const useMatchStore = defineStore("counter", () => {
  const BASEURI = "/api/matches";
  const state = reactive({
    myMBTI: "",
    friendMBTI: "",
    matchResult: "",
    compatibility: "",
  });
  const mbtiMatch = async () => {
    try {
      const response = await axios.get(BASEURI);
      if (response.status === 200) {
        const filtered = response.data.filter((item) => {
          return (
            item.myMBTI === state.myMBTI && item.friendMBTI === state.friendMBTI
          );
        });
        if (filtered.length > 0) {
          state.matchResult = filtered[0].result;
          state.compatibility = filtered[0].compatibility;
        } else {
          state.matchResult = "데이터 없음: 이 조합은 아직 분석되지 않았어요!";
          state.compatibility = "??";
        }
      }
    } catch (error) {
      alert("에러 발생: " + error);
    }
  };

  const saveResult = async (successCallback) => {
    try {
      const response = await axios.post(
        "http://localhost:3000/savedResults",
        state
      );
      if (response.status === 200 || response.status === 201) {
        alert("저장 완료!");
        successCallback();
      } else {
        alert("저장 실패");
        console.log(response.status);
      }
    } catch (error) {
      alert("에러 발생: " + error);
    }
  };

  const setMy = (my) => {
    state.myMBTI = my;
  };
  const setFriend = (friend) => {
    state.friendMBTI = friend;
  };

  const myMBTI = computed(() => state.myMBTI);
  const friendMBTI = computed(() => state.friendMBTI);
  const matchResult = computed(() => state.matchResult);
  const compatibility = computed(() => state.compatibility);

  return {
    myMBTI,
    friendMBTI,
    matchResult,
    compatibility,
    mbtiMatch,
    setMy,
    setFriend,
    saveResult,
  };
});
