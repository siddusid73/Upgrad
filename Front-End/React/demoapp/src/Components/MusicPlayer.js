import { useRef } from "react";
import React, { useState } from 'react';

export default function MusicPlayer() {
    const progressBarRef = useRef(null);
    const [playbackProgress, setPlaybackProgress] = useState(0);

    const handleProgressUpdate = (event) => {
        const newProgress = event.target.value;
        setPlaybackProgress(newProgress);
        progressBarRef.current.style.width = `${newProgress}%`
    };
    return (
        <div>
            <audio src="Mana Shankara Vara Prasad Garu - Boss (Chiranjeevi) Entry BGM Theme.mp3" controls />
            <input type="range" min="0" max="100" value={playbackProgress} onChange={handleProgressUpdate} />
            <div ref={progressBarRef} style={{ height: '10px', backgroundColor: 'gray' }} />
        </div>
    )

}