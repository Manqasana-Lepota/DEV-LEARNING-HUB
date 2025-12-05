import { createContext, useContext, useState } from "react"


const MusicContext = createContext();

export const MusicProvider = ({children}) => {

    const songs = [
    {
        id: 1,
        title: "FROM THE INSIDE OUT",
        artist: "Hillsong UNITED",
        url: "/songs/FROM THE INSIDE OUT - LIVE IN MIAMI - Hillsong UNITED.mp3",
        duration: "5:26",
    },
    {
        id: 2,
        title: "ALL I NEED IS YOU",
        artist: "Hillsong UNITED",
        url: "/songs/ALL I NEED IS YOU - LIVE IN MIAMI - Hillsong UNITED.mp3",
        duration: "5:57",
    },
];

    
    const [allSongs, setAllSongs] = useState(songs);
    const [currentTrack, setCurrentTrack] = useState(songs[0]);
    const [currentTrackIndex, setCurrentTrackIndex] = useState(0);
    const [currentTime, setCurrentTime] = useState(0);
    const [duration, setDuration] = useState(0);
    const [isPlaying, setIsPlaying] = useState(false);
    const [volume, setVolume] = useState(1);
    const [playlists, setPlaylists] = useState([]);
    
    const handlePlaySong = (song, index) => {
        setCurrentTrack(song);
        setCurrentTrackIndex(index);
        setIsPlaying(false);
    };
    
    const nextTrack = () => {
        setCurrentTrackIndex((prev) => {
        const nextIndex = (prev + 1) % allSongs.length;
        setCurrentTrack(allSongs[nextIndex]);
        return nextIndex;
    });
    setIsPlaying(false);
};
const prevTrack = () => {
    setCurrentTrackIndex((prev) => {
    const nextIndex = prev === 0 ? allSongs.length - 1 : prev - 1;
    setCurrentTrack(allSongs[nextIndex]);
    return nextIndex;
});
setIsPlaying(false);
};
    
const formatTime = (time) => {
    if (isNaN(time) || time === undefined) return "0:00";
    const minutes = Math.floor(time / 60);
    const seconds = Math.floor(time % 60);
    return `${minutes}:${seconds.toString().padStart(2, "0")}`;
 };

 const createPlaylist = (name) => {
    const newPlaylist = {
        id: Date.now(),
        name,
        songs: [],
    };
    setPlaylists((prev) => [...prev, newPlaylist]);

 }

 const play = () => setIsPlaying(true);
 const pause = () => setIsPlaying(false);
    
    
    
       
    return (
    <MusicContext.Provider value={{allSongs, 
        handlePlaySong , 
        currentTrackIndex, 
        currentTrack, 
        setCurrentTime, 
        currentTime,
        formatTime,
        duration,
        setDuration,
        nextTrack,
        prevTrack,
        play,
        pause,
        isPlaying,
        volume,
        setVolume,
        createPlaylist,
        playlists,
}}
    >{children}</MusicContext.Provider>);
};

export const useMusic = () => {
    const contextValue = useContext(MusicContext);
    if (!contextValue) {
        throw new Error("useMusic must be used inside of MusicProvider");
    }

    return contextValue;
}
