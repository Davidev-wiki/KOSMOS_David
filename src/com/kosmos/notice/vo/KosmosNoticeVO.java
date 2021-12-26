package com.kosmos.notice.vo;



public class KosmosNoticeVO {
	
	// �������� ���̺�: �ϴ��� ��Ī
	private String no_num;		// �������� �� ��ȣ
	private String mt_num;		// �ۼ���
	private String no_subject;	// ����
	private String no_contents;	// ����
	private String no_file;		// (���� ������ ������) ���ϸ�
	private	int no_hit;			// ��ȸ��
	private String no_insdate;	// �����
	private String no_upddate;	// ������
	private String no_delyn;	// ��������

	// ����ȸ�� ���̺�: ������ ������
	private String mt_name;		// ���� �̸�
	// �л�ȸ�� ���̺�: ������ ������
	private String ms_name;		// �л� �̸�
	
	// ���ǿ��� ���� ���� ���̵�
	private String mt_id;

	// �˻�
	private String searchType;	// ���Ӹ�
	private String keyword;		// �˻���
	
	// ����¡
	private String pageSize;
	private String groupSize;
	private String curPage;
	private String totalCount;		// ��ü �Խñ� ����
	
	
	// �⺻ ������
	public KosmosNoticeVO() {}

	// �����ε� ������
	public KosmosNoticeVO(String no_num, String mt_num, String no_subject,
						String no_contents,	String no_file, int no_hit,
						String no_insdate, String no_upddate, String no_delyn, 
						String searchType, String keyword,
						String pageSize, String groupSize, String curPage, String totalCount, // ����¡
						String mt_name, String ms_name) {

		// ��������
		this.no_num = no_num;
		this.mt_num = mt_num;
		this.no_subject = no_subject;
		this.no_contents = no_contents;
		this.no_file = no_file;
		this.no_hit = no_hit;
		this.no_insdate = no_insdate;
		this.no_upddate = no_upddate;
		this.no_delyn = no_delyn;
		
		// �˻�
		this.searchType = searchType;
		this.keyword = keyword;
		
		// ����¡
		this.pageSize = pageSize;
		this.groupSize = groupSize;
		this.curPage = curPage;
		this.totalCount = totalCount;
		
		// �޴� ��
		this.mt_name = mt_name;
		this.ms_name = ms_name;
	}


	// ===============================================================================
	// getter()
	// ===============================================================================

	public String getNo_num() {
		return no_num;
	}

	public String getMt_num() {
		return mt_num;
	}

	public String getNo_subject() {
		return no_subject;
	}

	public String getNo_contents() {
		return no_contents;
	}

	public String getNo_file() {
		return no_file;
	}

	public int getNo_hit() {
		return no_hit;
	}
	
	public String getNo_insdate() {
		return no_insdate;
	}

	public String getNo_upddate() {
		return no_upddate;
	}

	public String getNo_delyn() {
		return no_delyn;
	}

	public String getSearchType() {
		return searchType;
	}

	public String getKeyword() {
		return keyword;
	}

	public String getPageSize() {
		return pageSize;
	}

	public String getGroupSize() {
		return groupSize;
	}

	public String getCurPage() {
		return curPage;
	}

	public String getTotalCount() {
		return totalCount;
	}
		
	public String getMt_name() {
		return mt_name;
	}
	
	public String getMs_name() {
		return ms_name;
	}

	public String getMt_id() {
		return mt_id;
	}

	
	// ===============================================================================
	// setter()
	// ===============================================================================


	public void setNo_num(String no_num) {
		this.no_num = no_num;
	}

	public void setMt_num(String mt_num) {
		this.mt_num = mt_num;
	}

	public void setNo_subject(String no_subject) {
		this.no_subject = no_subject;
	}

	public void setNo_contents(String no_contents) {
		this.no_contents = no_contents;
	}

	public void setNo_file(String no_file) {
		this.no_file = no_file;
	}

	public void setNo_hit(int no_hit) {
		this.no_hit = no_hit;
	}
	
	public void setNo_insdate(String no_insdate) {
		this.no_insdate = no_insdate;
	}

	public void setNo_upddate(String no_upddate) {
		this.no_upddate = no_upddate;
	}

	public void setNo_delyn(String no_delyn) {
		this.no_delyn = no_delyn;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public void setGroupSize(String groupSize) {
		this.groupSize = groupSize;
	}

	public void setCurPage(String curPage) {
		this.curPage = curPage;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	
	public void setMt_name(String mt_name) {
		this.mt_name = mt_name;
	}

	public void setMs_name(String ms_name) {
		this.ms_name = ms_name;
	}
	
	public void setMt_id(String mt_id) {
		this.mt_id = mt_id;
	}

	
	// vo ���
	public static void printVO(KosmosNoticeVO nvo) {
		
		// �α��ν� ���ε��� ������ ���  
		System.out.println("\n===========KosmosNoticeVO ���� ���ε� ��Ȳ=============\n");
		System.out.println("�Էµ� ���� >>> : " + nvo.getNo_subject());
		System.out.println("�Էµ� ���� >>> : " + nvo.getNo_contents());
		System.out.println("���ε�� ����(��) >>> : " + nvo.getNo_file());
		System.out.println("\n");
		System.out.println("���� ���̺��� ���� ���� �̸� : " + nvo.getMt_name() );
		System.out.println("�л� ���̺��� ���� �л� �̸� : " + nvo.getMs_name() );
		System.out.println("\n============================================\n");

	}
	
}
