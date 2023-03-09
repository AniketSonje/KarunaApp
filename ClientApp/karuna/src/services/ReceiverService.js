import axios from 'axios';

const API_URL = 'http://localhost:8080';

class ReceiverService {
  registerReceiver(receiver) {
    return axios.post(`${API_URL}/receiver/register`, receiver);
  }

  viewItems() {
    return axios.get(`${API_URL}/receiver/items`);
  }

  deleteAccount(receiverId) {
    return axios.delete(`${API_URL}/receiver/${receiverId}`);
  }

  updateReceiver(updatedReceiver) {
    return axios.put(`${API_URL}/receiver/profile`, updatedReceiver);
  }

  login(dto) {
    return axios.post(`${API_URL}/receiver/login`, dto);
  }

  createRequest(reqDto) {
    return axios.post(`${API_URL}/receiver/request`, reqDto);
  }

  viewDonors() {
    return axios.get(`${API_URL}/receiver/donors`);
  }

  viewHistory(receiverId) {
    return axios.get(`${API_URL}/receiver/history/${receiverId}`);
  }

  receive(itemId) {
    return axios.put(`${API_URL}/receiver/${itemId}`);
  }

  logout(receiverId) {
    return axios.get(`${API_URL}/receiver/logout/${receiverId}`);
  }
}

export default new ReceiverService();
