import axios from "axios"



export const findStadiumNamesForMayKey = ['findStadiumNamesForMay'] 

export const findStadiumNamesForMay  = async () => {
    const { data } = await axios.get(`${process.env.NEXT_PUBLIC_API_URL}/search?`,
        { params: { q: 'player', oq: '' } }
    ) 
    return data
}
