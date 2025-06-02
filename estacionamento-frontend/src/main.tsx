import React from "react";
import ReactDOM from "react-dom/client";
import { RouterProvider, createBrowserRouter } from "react-router-dom";
import App from "./App.tsx";
import { AuthProvider } from "./contexts/AuthContext.tsx";
import "./index.css";
import Clients from "./routes/Clients.tsx";
import ErrorPage from "./routes/ErrorPage.tsx";
import Login from "./routes/Login.tsx";
import Overview from "./routes/Overview.tsx";
import Parking from "./routes/Parking.tsx";
import ParkingSpots from "./routes/ParkingSpots.tsx";
import Register from "./routes/Register.tsx";
import Vehicles from "./routes/Vehicles.tsx";

const router = createBrowserRouter([
  {
    path: "/",
    element: <App />,
    errorElement: <ErrorPage />,
    children: [
      { path: "/", element: <Overview /> },
      { path: "/parking", element: <Parking /> },
      { path: "/clients", element: <Clients /> },
      { path: "/vehicles", element: <Vehicles /> },
      { path: "/parking-spots", element: <ParkingSpots /> },
      { path: "/auth/login", element: <Login /> },
      { path: "/auth/register", element: <Register /> },
    ],
  },
]);

ReactDOM.createRoot(document.getElementById("root")!).render(
  <React.StrictMode>
    <AuthProvider>
      <RouterProvider router={router} />
    </AuthProvider>
  </React.StrictMode>
);
