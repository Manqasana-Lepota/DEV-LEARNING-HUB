import { AllSongs } from "./components/AllSongs";
import { MusicPlayer } from "./components/MusicPlayer";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { PlayLists } from "./components/PlayLists";
import { MusicProvider } from "./contexts/MusicContext";
import { Navbar } from "./components/Navbar";


function App() {
  return (
    <BrowserRouter>
      <MusicProvider>
        <div className="app">
          <Navbar />
          
          <main className="app-main">
            <div className="player-section">
              <MusicPlayer />
            </div>
            <div className="content-section">
              <Routes>
                <Route path="/" element={<AllSongs />}/>
                <Route path="/playlists" element={<PlayLists />}/>
              </Routes>
            </div>
          </main>
        </div>
      </MusicProvider>
    </BrowserRouter>
   
  );
}

export default App
