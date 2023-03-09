import axios from 'axios';

const BASE_URL = '/donor';

const DonorService = {
  registerDonor: async (donor) => {
    const response = await axios.post(`${BASE_URL}/register`, donor);
    return response.data;
  },

  viewCampaign: async () => {
    const response = await axios.get(`${BASE_URL}/campaigns`);
    return response.data;
  },

  deleteAccount: async (donorId) => {
    const response = await axios.delete(`${BASE_URL}/${donorId}`);
    return response.data;
  },

  updateDonor: async (donor) => {
    const response = await axios.put(`${BASE_URL}/profile`, donor);
    return response.data;
  },

  donate: async (item) => {
    const response = await axios.post(`${BASE_URL}/donate`, item);
    return response.data;
  },

  login: async (credentials) => {
    const response = await axios.post(`${BASE_URL}/login`, credentials);
    return response.data;
  },

  viewReceivers: async () => {
    const response = await axios.get(`${BASE_URL}/receivers`);
    return response.data;
  },

  viewHistory: async (donorId) => {
    const response = await axios.get(`${BASE_URL}/history/${donorId}`);
    return response.data;
  },

  logout: async (donorId) => {
    const response = await axios.get(`${BASE_URL}/${donorId}`);
    return response.data;
  }
};

export default DonorService;
