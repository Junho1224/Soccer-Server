import axios from "axios"


//hook 함수는 tsx에 있어야 함

export const getDistinctPositionKey = ['getDistinctPosition'] // 자바에서 const string 이랑 맞먹음

export const getDistinctPosition = async () => {// 구조 분해 할당
    const { data } = await axios.get(`${process.env.NEXT_PUBLIC_API_URL}/search?`,
        { params: { q: 'player', oq: '' } }
    ) //.then((res) =>
    return data//res.json(),
}
